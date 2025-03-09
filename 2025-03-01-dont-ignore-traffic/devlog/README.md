### Make Image
docker build --tag traffic:1.1 -f Dockerfile .

### Run Container
docker run -d \                               
--memory=2048m \
--cpus=2 \
-p 8080:8080 --name traffic traffic:1.1

