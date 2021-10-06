import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginmoduleComponent } from './loginmodule/loginmodule.component';

const routes: Routes = [
  {path:'login',component:LoginmoduleComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
