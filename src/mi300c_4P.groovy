package src
import groovy.transform.InheritConstructors
import platform

@InheritConstructors
class mi300c_4P extends platform {
    String fileType = '.FD'
    
    def getFirmwareName(){
        return 'Firmware-Name'
    }
}