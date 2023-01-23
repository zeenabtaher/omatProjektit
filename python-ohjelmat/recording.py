# -*- coding: utf-8 -*-
"""
Created on Mon Dec 26 11:24:21 2022

@author: zeena
"""

import sounddevice as sd
from scipy.io.wavfile import write

fs = 44100
seconds = 50

print('Recording start')
myrecording = sd.rec(int(seconds * fs), samplerate=fs, channels=2)
sd.wait()
write('sydan4.wav', fs, myrecording)
print('Record end')