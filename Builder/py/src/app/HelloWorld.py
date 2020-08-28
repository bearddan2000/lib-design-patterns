'''
Created on Oct 18, 2019

@author: Daniel Beard
'''
from app.Factory import *

class HelloWorld(object):
    '''
    classdocs
    '''
    mMessage = ""
    
    def __init__(self, obj = None):
        if obj != None:
            self.buildHelloWorld(obj)
        
    def buildHelloWorld(self, build_obj):
        age = createDecsionTree()
        try:
            age.test(build_obj)
        except:
            exit()
        self.mMessage = "Hello World to age: {}, first name: {}, last name: {}, location: {}, {}".format(build_obj.getAge(), build_obj.getFirstName(), build_obj.getLastName(), build_obj.getCity(), build_obj.getState() )

    def getMessage(self):
        return self.mMessage

    '''
    sets class vaiable
    '''
    def setMessage(self, param):
        self.mMessage = param