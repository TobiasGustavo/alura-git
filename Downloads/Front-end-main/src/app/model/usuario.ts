import { StringMap } from "@angular/compiler/src/compiler_facade_interface"
import { Postagem } from "./Postagem"

export class usuario{

    public id: number 
    public nome: string
    public usuario: string
    public senha: string
    public foto: string
    public tipo: string 
    public postagem: Postagem[]
}