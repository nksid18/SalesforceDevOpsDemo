node {
	stage ('SCM checkout'){
		git "https://github.com/nksid18/SalesforceDevOpsDemo"
		}
	stage ('Build'){
		dir("salesforcedemo") {
		bat "mvn clean install"
		}
		dir("salesforcedemo/target") {
		   bat "java -jar salesforcetestdemo-0.0.1-SNAPSHOT-jar-with-dependencies.jar"
	       }
	}
}
