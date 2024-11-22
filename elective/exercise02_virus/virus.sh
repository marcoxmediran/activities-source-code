#!/usr/bin/env bash

# Marcox C. Mediran
# BSCS3-1N
# Elective - Cybersecurity
# Exercise 2 - Create Your First Virus

# variables
WEBSITE="https://www.pup.edu.ph"
NOTIFICATION_TITLE="Virus!"
NOTIFICATION_MESSAGE="Welcome to PUP"

# functions
kill_browsers() {
  BROWSER=$(xdg-settings get default-web-browser)
  if [[ $BROWSER = "google-chrome.desktop" ]]; then
    BROWSER="chrome"
  elif [[ $BROWSER = "org.mozilla.firefox.desktop" ]]; then
    BROWSER="firefox"
  elif [[ $BROWSER = "brave-browser.desktop" ]]; then
    BROWSER="brave"
  fi
  pkill "$BROWSER"
}
launch_website() {
  xdg-open $WEBSITE > /dev/null 2>&1
}
pause() {
  sleep $1
}
notify() {
  notify-send -a "$NOTIFICATION_TITLE" "$NOTIFICATION_MESSAGE"
}

# payload
kill_browsers
launch_website
pause 3.0
notify
