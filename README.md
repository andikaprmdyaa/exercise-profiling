# Profiling Exercise

`/all_students`
![Screenshot (420).png](..%2F..%2FOneDrive%2FPictures%2FScreenshots%2FScreenshot%20%28420%29.png)

`all-student-name`
![Screenshot (421).png](..%2F..%2FOneDrive%2FPictures%2FScreenshots%2FScreenshot%20%28421%29.png)

`highes-gpa`
![Screenshot (422).png](..%2F..%2FOneDrive%2FPictures%2FScreenshots%2FScreenshot%20%28422%29.png)

# Optimization Result

`all-student`
![Screenshot (423).png](..%2F..%2FOneDrive%2FPictures%2FScreenshots%2FScreenshot%20%28423%29.png)
`all-student-name`
![Screenshot (424).png](..%2F..%2FOneDrive%2FPictures%2FScreenshots%2FScreenshot%20%28424%29.png)
`highest-gpa`
![Screenshot (425).png](..%2F..%2FOneDrive%2FPictures%2FScreenshots%2FScreenshot%20%28425%29.png)

## Conclusion

for `all-student` we got improvement of around 2000% in runtime (1674 ms to 254 ms), for `all-student-name` we got improvement of around 300% in runtime(684 ms to 267 ms), for `highest-gpa` we got around 1500% improvements in runtime(628 ms to 15 ms).

# Reflection

1. What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?

The difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of
optimizing application performance is that JMeter is used to test the performance of an application by simulating a large number of users
and measuring the response time of the application under load. On the other hand, IntelliJ Profiler is used to analyze the performance of an
application by profiling the code and identifying bottlenecks and performance issues in the application.


2. How does the profiling process help you in identifying and understanding the weak points in your application?

The profiling process helps in identifying and understanding the weak points in the application by analyzing the performance of the code and
identifying bottlenecks and performance issues. By profiling the code, we can identify the parts of the code that are taking the most time to
execute and optimize them for better performance. Profiling helps in understanding the performance characteristics of the application and
identifying the areas that need to be optimized for better performance.

3. Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?

Yes, IntelliJ Profiler effectively identifies bottlenecks by providing detailed code performance insights.
4. What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?

Challenges include finding specific functions and interpreting profiling results, addressed through documentation review and seeking advice from experienced friends.
5. What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?

Using IntelliJ Profiler offers detailed code performance insights, aiding in pinpointing execution bottlenecks.
6. How do you handle situations where the results from profiling with IntelliJ Profiler are not entirely consistent with findings from performance testing using JMeter?

I address inconsistencies between profiling and performance testing results by analyzing both, comparing findings, and identifying areas for optimization.
7. What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?

Strategies involve optimizing code using methods like stream() and max() while ensuring changes maintain application functionality through thorough testing.