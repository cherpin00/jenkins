package vars

abstract class paltform{
    String releaseType
    String testType
    String platformType
    abstract fileType
    
    platform (String releaseType, String testType, String platformType){
        this.releaseType = releaseType
        this.testType = testType
        this.platformType = platformType
    }

    abstract getFirmwareName()

    String flashSystem(){
        return 'Platform-flashSystem'
    }

    String parseLogs(){
        return 'Platform-parseLogs'
    }

}