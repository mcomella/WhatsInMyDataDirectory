# What's in my data directory?
Logs the content of various data directories when `onResume` is called. You can
analyze what's in the data directory of a fresh app by:
- Reading these logs through logcat
- Investigating the disk contents with "Device File Explorer"

Note that some directories are created by the calls to read the directories
themselves just as the files directory.
