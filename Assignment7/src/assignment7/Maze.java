/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author Asger
 */
public class Maze {
    int [][] maze = {   {1,1,1,1,1,1,1,1,1,1,1,1,1},
                        {1,3,1,0,1,0,1,0,0,0,0,0,1},
                        {1,0,1,0,0,0,1,0,1,1,1,0,1},
                        {1,0,0,0,1,1,1,0,0,0,0,0,1},
                        {1,0,1,0,0,0,0,0,1,1,1,0,1},
                        {1,0,1,0,1,1,1,0,1,0,0,0,1},
                        {1,0,1,0,1,0,0,0,1,1,1,0,1},
                        {1,0,1,0,1,1,1,0,1,0,1,0,1},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {1,1,1,1,1,1,1,1,1,1,1,1,1}
                    };
    
    public Maze() {
    }
    
    public int getValue(int x, int y) {
        return maze[x][y];
    }
    
    //http://stackoverflow.com/questions/20187547/recursive-algorithm-for-2d-maze/20187640
    /*public boolean solve(int row, int col) {
        char right = this.theMaze[row][col + 1];
        char left = this.theMaze[row][col - 1];
        char up = this.theMaze[row - 1][col];
        char down = this.theMaze[row + 1][col];
        if (right == 'G' || left == 'G' || up == 'G' || down == 'G') {
          return true;
        }
        System.out.println("position=>"+"("+row + ":" + col+")");
        if (right == ' ') {
          return solve(row,col+1);
        }
        if (down == ' ') {
          return solve(row+1,col);
        }
        if (left == ' ') {
          return solve(row,col-1);
        }
        if (up == ' ') {
          return solve(row-1,col);
        }
        return false;
    }*/
    
    public static void main(String[] args) {
        Maze maze = new Maze();
        System.out.println(maze.getValue(1, 1));
    }
}
