set -x
#Find the list of artifacts found in the artifactory
curl  http://localhost:5040/artifactory/libs-snapshot-local/com/wakaleo/gameoflife/gameoflife-web-${BUILD_NUMBER}/1.0-SNAPSHOT/ | grep gameoflife> artfiles.txt
#Find the last deployed artifact
line=`tail -n 1 artfiles.txt`
line=`echo $line | cut -d "\"" -f 2`
#Build the URL for downloading
url="http://localhost:5040/artifactory/libs-snapshot-local/com/wakaleo/gameoflife/gameoflife-web-${BUILD_NUMBER}/1.0-SNAPSHOT/$line"
#Download the latest war file from the Artifactory and place it in project folder
wget -O ~/gameoflife-${BUILD_NUMBER}.war $url
pwd
#Remove the temporary file generated
rm artfiles.txt
