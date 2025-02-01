#!/bin/bash
set -e  # Stop on error

echo "Packaging Installer..."
jpackage \
    --name DEPLOYMENT_TEST_APP \
    --main-jar Launcher.jar \
    --input artifacts/ \
    --main-class Launcher \
    --type exe \
    --install-dir "deployment_app" \
    --app-version 1.0.12 \
    --vendor "Ebbe Wertz Solo" \
    --copyright "© 2024 Ebbe Wertz. All rights reserved." \
    --description "This is a deployment test application." \
    --dest installer_output/


echo "Build complete!"
sleep 10s
