'''
Created on Oct 18, 2019

@author: Daniel Beard
'''
from app.HelloWorld import HelloWorld
from app.Builder import Builder

def main():
    mHelloWorldBuilder = Builder()
    mHelloWorldBuilder.Age(1)
    mHelloWorldBuilder.City("Toledo")
    mHelloWorldBuilder.State("OH")
    mHelloWorldBuilder.FirstName("John")
    mHelloWorldBuilder.LastName("Doe")
    mHelloWorld = HelloWorld(mHelloWorldBuilder)
    print(mHelloWorld.getMessage())

if __name__ == '__main__':
    main()