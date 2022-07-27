# -*- coding: utf-8 -*-
"""
Created on Thu Jul  7 22:35:32 2022

@author: zeena
"""

from gtts import gTTS
import os

speakText = ''
with open('bible.txt') as f:
    for i in range(5):
        myText = f.readline()
        myText = myText.replace('\n', '')
        speakText = speakText + myText
        print(myText)

language = 'en'

myobj = gTTS(text=speakText, lang=language, slow=False)
myobj.save("welcome.mp3")
os.startfile("welcome.mp3")