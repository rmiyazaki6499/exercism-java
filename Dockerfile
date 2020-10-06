FROM openjdk:8

WORKDIR /exercism

RUN apt-get update && \
	apt-get upgrade -y && \
	apt-get install git && \
	apt-get install -y vim && \
	apt-get install -y tig && \
	apt-get install -y silversearcher-ag 

RUN curl -s "https://get.sdkman.io" | bash && \
	sdk install gradle

COPY . .

CMD tail -f /dev/null 
