# -*- coding: utf-8 -*-
"""
Created on Sun Nov 20 20:08:10 2022

@author: zeena

Ohejlma on automatisoitu avaamaan työpöytö ja käynnistää sieltä Google Chromen, josta ohjelma 
hakee selaimesta nettisivun osoitetta. 
Ohjelma skrollaa nettisivun alas ja etsii sieltä annetun logon, jota klikataan. 
"""

import pyautogui
import time

time.sleep(3)

#Työpöydän avaaminen
#tyopoyta_koordinaatit = pyautogui.position()
#print(tyopoyta_koordinaatit)
pyautogui.moveTo(2556,1568,4)
pyautogui.click()

time.sleep(1)

#Chromen avaaminen
selaimen_koordinaatit = pyautogui.locateCenterOnScreen("selain.jpg", confidence=0.5)
pyautogui.moveTo(*selaimen_koordinaatit,4)
pyautogui.doubleClick()
print(selaimen_koordinaatit)
#pyautogui.hotkey("winleft", "up")
time.sleep(2)
pyautogui.keyDown("winleft")
pyautogui.press("up")
pyautogui.keyUp("winleft")
time.sleep(2)

#Huutokaupat.com sivuston hakeminen
pyautogui.hotkey("ctrl", "t")
pyautogui.write("https://huutokaupat.com/")
pyautogui.hotkey("enter")

print("ok")
time.sleep(3)

#Sivun skrollaaminen alas
pyautogui.scroll(-50000) 

print("ok!")

time.sleep(2)

#Ulosotto kuvakkeen etsiminen ja siitä painaminen
napin_koordinaatit = pyautogui.locateCenterOnScreen("ulosotto.jpg", confidence = 0.5)
#x, y = napin_koordinaatit
pyautogui.moveTo(*napin_koordinaatit,3)
pyautogui.click()
print(napin_koordinaatit)

time.sleep(4)

