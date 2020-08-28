'''
Created on Oct 18, 2019

@author: Daniel Beard
'''
import unittest
from app import HelloWorld as world

class TestHelloWorld(unittest.TestCase):

    def test_HelloWorld(self):
        obj = world.HelloWorld()
        obj.setMessage("Hello World")
        self.assertEqual(obj.getMessage(), "Hello World", "should equal")


if __name__ == "__main__":
    #import sys;sys.argv = ['', 'Test.testName']
    unittest.main()