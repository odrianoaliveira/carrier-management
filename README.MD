
mkdir ~/data

docker run --name local-mongo -p 27017:27017 -v ~/data:/data/db -d mongo:latest
