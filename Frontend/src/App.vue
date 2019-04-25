<template>
  <div id="app">
    <!-- <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link>
    </div> -->
    <router-view/>
  </div>
</template>

<script lang="ts">
import Navbar from '@/components/Navbar.vue';
export default {
  name: 'app',
  components: {
    Navbar,
  },
};
</script>


<style lang="scss">
@import '@/scss/_palette.scss';
@import '@/scss/_settings.scss';

#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  margin-top: $navbar-height;
  color: $palette-black;
  height: 100%;
  margin-bottom: -1060px; /* add this */
}

body {
  background-color: $palette-example-gray !important;
}

#hipo-logo-navbar {
  height: $navbar-height - 10;
}

button {
  // background-color: #0066dd;
  // border: none;
}

.navbar {
  height: $navbar-height;
  background-color: $palette-white;
  border-bottom: 1px solid $palette-gainsboro;
}

.dropdown-menu {
  border: 0px !important;
  border-radius: 0px !important;
  background-color: $palette-white !important;
  border: 1px solid $palette-gainsboro !important;
  margin-top: 3.5px !important;
}

.jumbotron {
  background-color: $palette-example-gray !important;
}

.nav-link {
  color: $palette-black !important;
}

.nav-non-link {
  color: $palette-black !important;
}

.float-right {
  float: right;
}
</style>
