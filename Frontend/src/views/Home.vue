<template>
  <div class="home">
    <Navbar/>
    <div class="container landing-page">
      <div class="container-fluid jumbotron">
        <div class="container">
          <div class="row">
            <div class="col-3">
            </div>
            <div class="col-6">
              <h1 class="display-4">Novem Financial</h1>
              <p
                class="lead"
              >Take control of your finances</p>
              
            </div>
            <div class="col-3">
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import HelloWorld from '@/components/HelloWorld.vue'; // @ is an alias to /src
import Navbar from '@/components/Navbar.vue';

@Component({
  components: {
    HelloWorld,
    Navbar,
  },
})
export default class Home extends Vue {}
</script>
