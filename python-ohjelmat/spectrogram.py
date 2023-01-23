# -*- coding: utf-8 -*-
"""
Created on Mon Dec 26 11:30:22 2022

@author: zeena
"""

import numpy as np
from scipy.signal import butter, lfilter, freqz, find_peaks, peak_prominences
import matplotlib.pyplot as plt
import scipy.io.wavfile as wavfile
import sounddevice as sd


plt.close('all')
#Reading and trim wav file
Fs, aud = wavfile.read('sydan.wav')
aud = aud[:,0]
first = aud[:int(Fs*50)]


x = np.power(aud[0:44100*3],2)
x = np.convolve(x, np.ones(2000)/2000, mode='valid')
peaks, _ = find_peaks(x, height=0.0004, distance=10000)
prominences = peak_prominences(x, peaks)[0]

contour_heights = x[peaks]-prominences

plt.figure()
plt.plot(x)
plt.plot(peaks, x[peaks], "x")
#plt.vlines(x=peaks, ymin=contour_heights, ymax=x[peaks])

plt.title("Raksittu")
plt.show()

#Calculate peasks distances
etaisyydet = [peaks[j+1]-peaks[j] for j in range(len(peaks)-1)]

t = [etaisyydet[i]/Fs for i in range(len(etaisyydet))]

def Average(t):
    return sum(t)/len(t)

t_hattu = Average(t)

f = 1/t_hattu
bpm = str(f*60)
print("syke on " + str(f) + "Hz eli " + bpm + "bpm")
print()
print("Sikiölle normaali sydämen lyöntitiheys(syke) on 120-160bpm(lyöntiä minuutissa)")

#Generate spectrogram
plt.figure()
powerSpectrum, frequenciesFound, time, imageAxis = plt.specgram(first, Fs=Fs,NFFT=2**18,noverlap=Fs/10)
plt.ylim(0,10)
plt.show()
#sd.play(aud[0:44100*5], Fs)

plt.figure()
plt.title("alkuperäinen signaali")
plt.plot(aud[0:44100*3])
plt.show()

plt.figure()
plt.title("alkuperäisen signaalin energia")
plt.plot(np.power(aud[0:44100*3], 2))
plt.show()


cutoff = 50.4
order = 2


def butter_lowpass(cutoff, Fs, order=5):
    return butter(order, cutoff, fs=Fs, btype='low', analog=False)


def butter_lowpass_filter(data, cutoff, Fs, order=5):
    b, a = butter_lowpass(cutoff, Fs, order=order)
    y = lfilter(b, a, data)
    return y

#aud_filtered = butter_lowpass_filter(aud, cutoff, Fs)
aud_filtered = np.convolve(aud, np.ones(1000) / 1000, mode='valid')

plt.figure()
plt.plot(aud_filtered[0:44100*3])
plt.title("alipäästösuodatettu")
plt.show()

sd.play(100*aud_filtered[0:44100*5], Fs)