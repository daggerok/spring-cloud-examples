FROM vault:0.8.3
MAINTAINER Maksim Kostromin <daggerok@gmail.com>
RUN apk --no-cache add curl
HEALTHCHECK --interval=15s --timeout=15s --retries=20 CMD curl -f http://127.0.0.1:8200/v1/sys/health || exit 1
