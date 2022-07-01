# Setup couchbase

docker run -d --name db -p 8091-8094:8091-8094 -p 11210:11210 couchbase

then configure the instance by accessing:

http://localhost:8091

setup username as "admin" password as "password" and setup a bucket with name "mydoc" 