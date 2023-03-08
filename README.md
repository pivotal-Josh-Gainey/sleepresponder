# sleepresponder

This cf pushable application simulates a slow responding application.

The api endpoint `/connect_with_sleep`.
The parameter `sleep_time` is in milliseconds.

Example to simulate an api call that takes 5 seconds.<br>
`curl "<url of app>/connect_with_sleep?sleep_time=5000"`
