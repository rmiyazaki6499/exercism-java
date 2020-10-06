FROM openjdk:8

WORKDIR /exercism

RUN apt-get update && \
	apt-get upgrade -y && \
	apt-get install git && \
	apt-get install -y vim && \
	apt-get install -y tig && \
	apt-get install -y silversearcher-ag && \
	apt-get install -y zsh

RUN wget -O- https://raw.githubusercontent.com/deluan/zsh-in-docker/master/zsh-in-docker.sh | zsh || true

COPY . .

CMD tail -f /dev/null 
