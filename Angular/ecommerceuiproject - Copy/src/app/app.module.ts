import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginmoduleComponent } from './loginmodule/loginmodule.component';
import { ProductComponent } from './product/product.component';
import { AddproductComponent } from './product/addproduct/addproduct.component';
import { EditproductComponent } from './product/editproduct/editproduct.component';
import { ViewtproductmoduleComponent } from './product/viewtproductmodule/viewtproductmodule.component';
import { AddpcustomermoduleComponent } from './customer/addpcustomermodule/addpcustomermodule.component';
import { AddusermoduleComponent } from './user/addusermodule/addusermodule.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginmoduleComponent,
    ProductComponent,
    AddproductComponent,
    EditproductComponent,
    ViewtproductmoduleComponent,
    AddpcustomermoduleComponent,
    AddusermoduleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
