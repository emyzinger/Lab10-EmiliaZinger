**Discuss how ClosestFirstIterator and RandomWalkIterator work.**
The ClosestFirstIterator works by choosing a node that is closest on a weighted graph. This would be useful to help find the shortest distance between nodes. The RandomWalkIterator works by at each node that it encounters it picks a random edge to get to another node. With this iterator there is no guarantee that it will reach all the nodes after a certain number of iterations. 

**Discuss the differences among the results. Does the starting point make a difference?**
The biggest difference between these results is that the countries appear in different orders. Because we are running each iterator until all the countries have been printed the first three should all take about the same amount of time. The RandomWalkIterator however, would be the one to take longer because it goes through the graph randomly and so it can go to the same node multiple times. The starting points do not seem to make a difference, if it does in time it would be very small because each of these run very fast, but because we are accessing every node the starting point should only make a difference of the order that the countries are printed. 

**Give two or three examples of how/why a real-world map might require more than four colors.**
A real words map might required more than 4 colors because some regions may not be contiguous yet they still need to be the same color. Some examples could be Michigan or Azerbaijan or Russia.  
