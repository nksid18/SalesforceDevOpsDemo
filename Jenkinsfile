node {
	stage ('SCM checkout'){
		git "https://github.com/nksid18/SalesforceDevOpsDemo"
		}
	stage ('Build'){
    	dir("salesforcedemo") {
	   bat "mvn -f C:\\Program Files (x86)\\Jenkins\\workspace\\SFScriptedPipeline\\salesforcetestdemo\\pom.xml clean install"
       }
       	dir("salesforcedemo/target") {
	   bat "java -jar salesforcetestdemo-0.0.1-SNAPSHOT-jar-with-dependencies.jar"
       }
		}
}
