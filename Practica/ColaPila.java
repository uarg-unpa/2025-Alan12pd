package Practica;

public ColaPila mazclando(PilaInt p , ColaInt c) {
   ColaPila resultado = new ColaPila();
   PilaInt auxPila = new PilaInt();
   ColaPila auxCola = new ColaPila();

   
   while (!p.estaVacia()) {
       auxPila.meter(p.sacar());
   }

   
   while (!auxPila.estaVacia() || !c.estaVacia()) {
       if (!auxPila.estaVacia()) {
           int valorPila = auxPila.sacar();
           resultado.insertar(valorPila);
           p.meter(valorPila); 
       }
       if (!c.estaVacia()) {
           int valorCola = c.borrar();
           resultado.insertar(valorCola);
           auxCola.insertar(valorCola); 
       }
   }

   
   while (!auxCola.estaVacia()) {
       c.insertar(auxCola.borrar());
   }

   return resultado;
}

