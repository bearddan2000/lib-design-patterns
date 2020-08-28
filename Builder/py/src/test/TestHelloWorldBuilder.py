'''
Created on Oct 22, 2019

@author: Daniel Beard
'''
import unittest
from app.HelloWorld import HelloWorld
from app.Builder import Builder

class TestHelloWorldBuilder(unittest.TestCase):

    mMessage = "Hello World to age: 1, first name: John, last name: Doe, location: Toledo, OH"
    mHelloWorld = None
    mHelloWorldBuilder = None

    def setUp(self):
        self.mHelloWorld = HelloWorld()
        self.mHelloWorldBuilder = Builder()
        self.mHelloWorldBuilder.Age(1)
        self.mHelloWorldBuilder.City("Toledo")
        self.mHelloWorldBuilder.State("OH")
        self.mHelloWorldBuilder.FirstName("John")
        self.mHelloWorldBuilder.LastName("Doe")

    def tearDown(self):
        self.mHelloWorld = None
        self.mHelloWorldBuilder = None
        
    def test_missingAge(self):
        self.mHelloWorldBuilder.Age()
        self.mHelloWorld = HelloWorld(self.mHelloWorldBuilder)
        self.assertRaises(Exception)
        
    def test_builder(self):
        self.mHelloWorld = HelloWorld(self.mHelloWorldBuilder)
        self.assertEqual(self.mHelloWorld.getMessage(), self.mMessage, "should equal")


if __name__ == "__main__":
    #import sys;sys.argv = ['', 'Test.test']
    unittest.main()