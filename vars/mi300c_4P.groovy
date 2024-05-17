package vars
import groovy.transform.InheritConstructors
import vars.platform

@InheritConstructors
class mi300c_4P extends platform {
    String fileType = '.FD'
    
    def getFirmwareName(){
        return 'Firmware-Name'
    }
}