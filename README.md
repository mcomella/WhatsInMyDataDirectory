# What's in my data directory?
This is a companion repository to my ["Android Studio 3.0 Profiler Injects Files
Into Data Directory"][profiler] blog post.

Logs the content of various data directories when `onResume` is called. You can
analyze what's in the data directory of a fresh app by:
- Reading these logs through logcat
- Investigating the disk contents with "Device File Explorer"

Note that some directories are created by the calls to read the directories
themselves just as the files directory.

[profiler]: http://mcomella.xyz/blog/2017/as-3-profiler-injects-files.html
