package gameOfLife;
import java.util.Random;
public class Box {
	
		Cell[] box;
		int n;
		
		public Box(int n){
			this.box = new Cell[n*n];
			this.n = n;
		}
		
		public void populate(double seed){
			for(int i = 0; i<box.length;i++){
				double r = Math.random();
				if(r <= seed){
					box[i] = new Cell('X',true);
				}
				else{
					box[i] = new Cell('\u0000',false);
				}
			}
		}
		
		public void turn() throws IndexOutOfBoundsException{
			int counter = 0;
			
			for(int i = 0; i < this.box.length; i++){
				//System.out.println("i= " + i);
				if(this.box[i].c == 'X'){
					if(i == 0 || i%n == 0){
						//System.out.println("left");
						counter += 3;
				
						try{
							if(this.box[i-n].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i-n+1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}

						try{
							if(this.box[i+n].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+n+1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
				
					}
					else if((i+1)%n==0){
						//System.out.println("right");
						counter += 3;
						try{
							if(this.box[i-n-1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i-n].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}

						try{
							if(this.box[i-1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+n-1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+n].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
				
					}
					else{
						try{
							if(this.box[i-n-1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i-n].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i-n+1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i-1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+n-1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+n].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+n+1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
				
					}
				
					
					//System.out.println("c= " + counter);
					if(counter == 6 || counter == 5){
						counter = 0;
						this.box[i].state = true;
					}
					else{
						//System.out.println("Death");
						counter = 0;
						this.box[i].state = false;
					}
				}
				
				if(this.box[i].c == '\u0000'){
					
					if((i+1)%n==0){
						//System.out.println("right");
						counter += 3;
						try{
							if(this.box[i-n-1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i-n].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}

						try{
							if(this.box[i-1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+n-1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+n].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
					}
					else if(i == 0 || i%n == 0){
						//System.out.println("left");
						counter +=3;

						try{
							if(this.box[i-n].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i-n+1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+n].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+n+1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
				
					}
					else{
						try{
							if(this.box[i-n-1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i-n].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i-n+1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i-1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+n-1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+n].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
						try{
							if(this.box[i+n+1].c == '\u0000'){
								counter ++;
							}
						}
						catch(IndexOutOfBoundsException e){
							//System.out.println("Outside");
							counter ++;
						}
					}
					
					//System.out.println("c= " + counter);
					if(counter == 5){
						//System.out.println("Born");
						this.box[i].state = true;
						counter = 0;
					}
					else{
						this.box[i].state = false;
						counter = 0;
					}
				}
			}
			for(int j = 0; j< this.box.length;j++){
				if(this.box[j].state == true){
					this.box[j].c = 'X';
				}
				else if (this.box[j].state == false){
					this.box[j].c = '\u0000';
				}
			}
		}
		

		
		public void print(){
			//System.out.println("-----------------------------------------------------------------");
			System.out.println();
			for(int i = 0; i < this.box.length; i++){
				System.out.print(this.box[i].c);
				if((i+1)%n==0){
					System.out.println();
				}	
				
			}
			
			
		}
}
