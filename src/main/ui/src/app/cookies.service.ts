import { Injectable } from '@angular/core';

@Injectable()
export class CookiesService {

  constructor() { }

  public getCookie(name: string): string {
    let ca: Array<string> = document.cookie.split(';');
    let caLen: number = ca.length;
    let cookieName = `${name}=`;
    let c: string;

    for (let i: number = 0; i < caLen; i += 1) {
      c = ca[i].replace(/^\s+/g, '');
      if (c.indexOf(cookieName) == 0) {
        return c.substring(cookieName.length, c.length);
      }
    }
    return '';
  }

  public deleteCookie(name) {
    this.setCookie(name, '');
  }

  public setCookie(name: string, value: string) {
    document.cookie = name + "=" + value;
  }
}
