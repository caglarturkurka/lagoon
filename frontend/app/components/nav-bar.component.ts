import {Component} from 'angular2/core';
import {ROUTER_DIRECTIVES} from 'angular2/router';

@Component({
  selector: 'nav-bar',
  directives:[ROUTER_DIRECTIVES],
  templateUrl: 'app/components/nav-bar.component.html'
})
export class NavBar {

}
