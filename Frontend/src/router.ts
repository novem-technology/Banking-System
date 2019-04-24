import Vue from 'vue';
import Router from 'vue-router';
import Home from './views/Home.vue';
import Login from './views/Login.vue';
import Register from './views/Register.vue';
import About from './views/About.vue';
import Teller from './views/Teller.vue';
import Employee from './views/Employee.vue';
import Atm from './views/atm/Atm.vue';
import Account from './views/account/Account.vue';
import Transfer from './views/account/Transfer.vue';
import Loans from './views/account/Loans.vue';
import CreateCustomer from './views/account/CreateCustomer.vue';

Vue.use(Router);

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/login',
      name: 'login',
      component: Login,
    },
    {
      path: '/register',
      name: 'register',
      component: Register,
    },
    {
      path: '/atm',
      name: 'atm',
      component: Atm,
    },
    {
      path: '/teller',
      name: 'teller',
      component: Teller,
    },
    {
      path: '/employee',
      name: 'employee',
      component: Employee,
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/About.vue'),
    },
    {
      path: '/account',
      name: 'account',
      component: Account,
    },
    {
      path: '/account/transfer',
      name: 'transfer',
      component: Transfer,
    },
    {
      path: '/account/loans',
      name: 'loans',
      component: Loans,
    },
    {
      path: '/teller/create-customer',
      name: 'create customer',
      component: CreateCustomer
    }
  ],
});
