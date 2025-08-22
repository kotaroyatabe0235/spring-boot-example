# ベースイメージとして Debian Bookworm を使用
FROM debian:bookworm

# 必要なパッケージをインストール
RUN apt update && apt install -y \
    openjdk-17-jdk \
    maven \
    curl \
    git \
    unzip \
    && apt clean && rm -rf /var/lib/apt/lists/*

# Quarkus CLI のインストール
RUN curl -Ls https://github.com/quarkusio/quarkus/releases/latest/download/quarkus-cli-2.22.0.Final-linux-x86_64 -o /usr/local/bin/quarkus \
    && chmod +x /usr/local/bin/quarkus

# 作業ディレクトリを設定
WORKDIR /workspace

# デフォルトのコマンドを設定
CMD ["bash"]