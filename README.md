# Alive
To check if all the cells of the 2D grid can become Alive based on the given conditions by traversing through the grid. 

Coming Alive ------ ----
There’s a rectangle consisting of m * n cells.  A cell can become "alive" only if EXACTLY two of its four neighbor cells are alive.  
You are to determine if the entire rectange can become "alive"; 
if so print "possible", otherwise print "impossible".

The input will be a sequence of rectangles and configurations.  Retangles are specified by two integers m and n in that order on one line.  
The list of cells that are initially alive is provided as ordered pairs, one pair per line, terminated by the pair 0 0.  
The coordinates of the cells are indexed 1, 2, ..., m and 1, 2, ..., n. The input terminates with an end of file.
The rectangle will not be larger than 500 * 500 or smaller than 1 * 1.

Example Input:

3 3 
1 1 
2 2 
3 3 
0 0 
3 3 
1 1 
2 2 
3 3 
3 1 
0 0

Example Output:

possible 
impossible

//If you think the text is not in format, please hit the raw button on the top.


