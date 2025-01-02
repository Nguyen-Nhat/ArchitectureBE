name ?= bff
proto:
	protoc --proto_path=app/common/src/main/proto --java_out=app/common/src/main/java --grpc-java_out=app/common/src/main/java app/common/src/main/proto/*.proto
run:
	mvn spring-boot:run -pl app/$(name) -am