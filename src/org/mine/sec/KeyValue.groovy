package org.mine.sec

class KeyValue {
  def config
  def script

  KeyValue(script,config) {
    this.config = config
    this.script = script
  }

  
  void returnKey(){
	this.script.stage('KeyValue'){
		def defaultconfigtxt = this.script.libraryResource this.config.resource
		def defaultconfig = this.script.readProperties text: defaultconfigtxt
		return defaultconfig.this.config.key
   	}	
   }
}
