'''
Factory pattern builds a decision tree
Created on Oct 22, 2019

@author: Daniel Beard
'''
from algorithm.AbstractDecisionTree import *

def createDecsionTree():
    age = AgeLeaf()
    last = LastLeaf()
    first = FirstLeaf()
    city = CityLeaf()
    state = StateLeaf()
    
    age.nextLeaf(last)
    last.nextLeaf(first)
    first.nextLeaf(city)
    city.nextLeaf(state)
    
    return age