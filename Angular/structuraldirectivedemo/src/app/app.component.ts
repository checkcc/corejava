import { Component } from '@angular/core';
import { fruit } from './app.fruit';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
flag=false;
name="";
fullName="ram kumar";


//logic part
show(){
this.flag=true;
this.name="ankit is my name";
console.log("name   "+this.name);
console.log("flag   "+this.flag);
}

//demo for ng for

fruits:fruit[]=[{name:"mango",cost:"20kg"},
                {name:"apple",cost:"23kg"},
                {name:"kiwi",cost:"25kg"}]

}