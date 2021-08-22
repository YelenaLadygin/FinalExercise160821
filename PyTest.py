# 8
import pytest
from selenium import webdriver
import sys
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.keys import Keys
from time import sleep

def test_lamda_test():
    driver = webdriver.Chrome('C:\\Users\\yelena\\QA-SELENIUM\\chromedriver.exe')
    driver.get('https://demoqa.com/buttons')


    driver.find_element_by_xpath('/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button').click()
    sleep(5)

    driver.close()