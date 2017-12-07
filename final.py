import sys
from PySide2 import QtWidgets
from PySide2 import QtCore
from PySide2 import QtGui

import serial 
ser = serial.Serial('/dev/ttyUSB0', 9600)

class ButtonWindow(QtWidgets.QWidget):
    def __init__(self):
        QtWidgets.QWidget.__init__(self)
        self.roiLabel = QtWidgets.QLabel('Rate of Interest')
    
        self.roiSpin = QtWidgets.QSpinBox()
        self.roiSpin.setMinimum(0)
        self.roiSpin.setMaximum(180)
        
        self.roiDial = QtWidgets.QDial()
        self.roiDial.setNotchesVisible(True)
        self.roiDial.setMinimum(0)
        self.roiDial.setMaximum(180)
        self.roiDial.valueChanged.connect(self.arduino_connect)
        
        self.myGridLayout = QtWidgets.QGridLayout()
    
        self.myGridLayout.addWidget(self.roiLabel, 0, 0)
        self.myGridLayout.addWidget(self.roiSpin, 0, 1)
        self.myGridLayout.addWidget(self.roiDial, 0, 2)
    
        self.setLayout(self.myGridLayout)
    
        self.roiDial.valueChanged.connect(self.roiSpin.setValue)
        self.roiSpin.valueChanged.connect(self.roiDial.setValue)
        
        self.setWindowTitle("LED ON/OFF Blink")
        self.setGeometry(300,200,200,200)
        self.button1=QtWidgets.QPushButton("LED_ON",self)
        self.button1.setGeometry(130, 100, 100, 30)
        self.button1.clicked.connect(self.ON)
        
        self.button2=QtWidgets.QPushButton("LED_OFF",self)
        self.button2.setGeometry(130, 200, 100, 30)
        self.button2.clicked.connect(self.OFF)
    def ON(self):
            ser.write(b'n')
    def OFF(self):
            ser.write(b'f')
    def arduino_connect(self):
        cmd=chr(self.roiDial.value()).encode()
        ser.write(cmd)
        
       
if __name__=="__main__":
    app=QtWidgets.QApplication(sys.argv)
    bw=ButtonWindow()
    bw.show()
    sys.exit(app.exec_())

ser.close()