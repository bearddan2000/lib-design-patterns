'''
Pipe and filter pattern with
Null object pattern
Created on Oct 18, 2019

@author: Daniel Beard
'''

class DecisionTree(object):
    '''
    classdocs
    '''
    mMessage = ""
    mNextLeaf = None

    def nextLeaf(self, obj):
        self.mNextLeaf = obj
 
class NullLeaf(DecisionTree):
        
    def test(self, obj):
        pass
           
class AgeLeaf(DecisionTree):
    def __init__(self):
        DecisionTree.mMessage = "age not set"
        DecisionTree.mNextLeaf = NullLeaf()
        
    def test(self, obj):
        if obj.getAge() == None:
            raise Exception(DecisionTree.mMessage)
        else:
            DecisionTree.mNextLeaf.test(obj)
            
class FirstLeaf(DecisionTree):
    def __init__(self):
        DecisionTree.mMessage = "first name not set"
        DecisionTree.mNextLeaf = NullLeaf()
        
    def test(self, obj):
        if obj.getFirstName() == None:
            raise Exception(DecisionTree.mMessage)
        else:
            DecisionTree.mNextLeaf.test(obj)
           
class LastLeaf(DecisionTree):
    def __init__(self):
        DecisionTree.mMessage = "last name not set"
        DecisionTree.mNextLeaf = NullLeaf()
        
    def test(self, obj):
        if obj.getLastName() == None:
            raise Exception(DecisionTree.mMessage)
        else:
            DecisionTree.mNextLeaf.test(obj)
           
class StateLeaf(DecisionTree):
    def __init__(self):
        DecisionTree.mMessage = "state not set"
        DecisionTree.mNextLeaf = NullLeaf()
        
    def test(self, obj):
        if obj.getState() == None:
            raise Exception(DecisionTree.mMessage)
        else:
            DecisionTree.mNextLeaf.test(obj)
           
class CityLeaf(DecisionTree):
    def __init__(self):
        DecisionTree.mMessage = "city not set"
        DecisionTree.mNextLeaf = NullLeaf()
        
    def test(self, obj):
        if obj.getCity() == None:
            raise Exception(DecisionTree.mMessage)
        else:
            DecisionTree.mNextLeaf.test(obj)
                                                           