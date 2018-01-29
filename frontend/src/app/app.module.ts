import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule }   from '@angular/forms';


import { NumbersOnlyDirective } from './number.directive';
import { AppComponent } from './app.component';
import { UsuarioFormComponent } from './usuario-form/usuario-form.component';




@NgModule({
  declarations: [
    AppComponent,
    UsuarioFormComponent,
    NumbersOnlyDirective
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
