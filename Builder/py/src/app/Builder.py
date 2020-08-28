'''
Builder pattern with decision tree

Created on Oct 18, 2019

@author: Daniel Beard
'''

class Builder(object):
    '''
    classdocs
    '''

    def Age(self, params = None):
        self.mAge = params
        return self
     
    def City(self, params = None):
        self.mCity = params
        return self
    
    def State(self, params = None):
        self.mState = params
        return self
    
    def FirstName(self, params = None):
        self.mFirst = params
        return self
     
    def LastName(self, params = None):
        self.mLast = params   
        return self
    
    def getAge(self):
        return str(self.mAge)
     
    def getCity(self):
        return self.mCity
    
    def getState(self):
        return self.mState
    
    def getFirstName(self):
        return self.mFirst
     
    def getLastName(self):
        return self.mLast