package software;

import java.awt.Color;
import java.awt.Graphics;

class Map {
	private  int mapsize;
	private  int gridsize;
	int[][] map ;
	int[][] lifenumber;
	boolean flag = false;
	Color live = Color.cyan;
	Color dead = Color.white;
	public Map(){
		mapsize = 50;
		gridsize = 20;
		map = new int[mapsize+2][mapsize+2];
		lifenumber =new int[mapsize+2][mapsize+2];
	}
	public void setmapsize(int mapsize){
		this.mapsize = mapsize;
	}
	public int getmapsize(){
		return this.mapsize;
	}
	public int getgridsize(){
		return this.gridsize;
	}
	public void setgridsize(int gridsize){
		this.gridsize = gridsize;
	}
	public void updateMap(Graphics g) {
   	 for(int i=1;i<mapsize+1;i++){
       	 for(int j=1;j<mapsize+1;j++){
       		 if(map[i][j]==1)
       			 g.setColor(live);
       		 else
       			 g.setColor(dead);
       		 g.fillRect((i-1) * gridsize, (j-1) * gridsize, gridsize - 1, gridsize - 1);

            }
       }

   }
	public void getlifenumber() { 
        for(int i=1;i<mapsize+1;i++){
       	 for(int j=1;j<mapsize+1;j++){
       		 int t=0;
       		 if(map[i-1][j-1]==1){
       			 t++;
       		 }
       		 if(map[i-1][j]==1){
       			 t++;
       		 }
       		 if(map[i-1][j+1]==1){
       			 t++;
       		 }
       		 if(map[i][j-1]==1){
       			 t++;
       		 }
       		 if(map[i][j+1]==1){
       			 t++;
       		 }
       		 if(map[i+1][j-1]==1){
       			 t++;
       		 }
       		 if(map[i+1][j]==1){
       			 t++;
       		 }
       		 if(map[i+1][j+1]==1){
       			 t++;
       		 }
       		 lifenumber[i][j]=t;
       	 }
        }
   }
	 public void newmap() {
         for(int i=1;i<mapsize+1;i++){
       	  for(int j=1;j<mapsize+1;j++){
       		  if(lifenumber[i][j]>=4||lifenumber[i][j]<=1){
       			  map[i][j]=0;
       		  }
       		  if(lifenumber[i][j]==3){
       			  map[i][j]=1;
       		  }
       		  
       	  }
         }
   }
}
