import Vue from 'vue';
import Router from 'vue-router';
import Home from './views/Home.vue';
import Account from './views/Account.vue';
import Atm from './views/Atm.vue';
import Employee from './views/Employee.vue';
import About from './views/About.vue';

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
      path: '/account',
      name: 'account',
      component: Account,
    },
    {
      path: '/atm',
      name: 'atm',
      component: Atm,
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
  ],
});
