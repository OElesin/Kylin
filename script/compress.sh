#!/bin/sh

# pack webapp into kylin.war so that we have a all-in-one war
dir=$(dirname ${0})
cd ${dir}/..

if [ -z "$version" ]
then
    echo 'version not set'
    version=`mvn org.apache.maven.plugins:maven-help-plugin:2.1.1:evaluate -Dexpression=project.version | grep -v '\['`
    echo "${version}"
fi

#package tgz
echo 'package tgz'
rm -rf kylin-${version}
mkdir kylin-${version}
cp -r lib bin conf tomcat kylin-${version}
tar -cvzf kylin-${version}.tgz kylin-${version}
rm -rf kylin-${version}