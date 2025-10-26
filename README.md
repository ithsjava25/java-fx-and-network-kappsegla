[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/a8ELiITv)
# JavaFX Chat App 💬

A JavaFX-based chat client using [ntfy](https://docs.ntfy.sh/) for backend messaging.

## Features
- MVC architecture
- Send text messages to configurable topic via [JSON POST](https://docs.ntfy.sh/publish/#publish-as-json)
- Receive messages via [JSON stream](https://docs.ntfy.sh/subscribe/api/)
- Backend URL via env variable (not committed)
- Branch + PR workflow (no direct commits to `main`)
- Unit tests for `Model` class
- (Advanced) Send files via "Attach local file" option

## 🚀 Run Instructions
1. Set `JAVA_HOME` to JDK 25
2. Start with:
   ```bash
   ./mvnw clean javafx:run
