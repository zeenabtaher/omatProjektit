# -*- coding: utf-8 -*-
"""
Created on Fri Nov 25 08:11:12 2022

@author: zeena

Automated program draws a spyro when some drawn app is open exampe Pain.net.
"""

import pyautogui
import time

time.sleep(3)

distance = 200
while distance > 0:
    pyautogui.dragRel(distance,0,1,button="left") #left to right
    distance = distance - 10
    pyautogui.dragRel(0,distance,1,button="left") #up to down
    pyautogui.dragRel(-distance,0,1,button="left") #right to left
    distance = distance - 10
    pyautogui.dragRel(0, -distance,1,button="left") #down to up
    
    time.sleep(3)
    
    
