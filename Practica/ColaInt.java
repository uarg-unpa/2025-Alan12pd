package Practica;

public ColaInt mazclando(PilaInt p , ColaInt c) {
   ColaInt resultado = new ColaInt();
   PilaInt auxPila = new PilaInt();
   ColaInt auxCola = new ColaInt();

   // Vaciar pila en auxiliar para invertir el orden
   while (!p.estaVacia()) {
       auxPila.meter(p.sacar());
   }

   // Mezclar elementos de la pila y la cola
   while (!auxPila.estaVacia() || !c.estaVacia()) {
       if (!auxPila.estaVacia()) {
           int valorPila = auxPila.sacar();
           resultado.insertar(valorPila);
           p.meter(valorPila); // Restaurar pila original
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