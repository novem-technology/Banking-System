<template>
  <div class="home">
    <Navbar/>
    <div class="container landing-page">
      <div class="container-fluid jumbotron">
        <div class="container">
          <div class="row">
            <div class="col-4">
            </div>
            <div class="col-8">
              <h1 class="display-4">Novem Financial</h1>
              <p
                class="lead"
              >This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>
              <hr class="my-4">
              <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
              <p class="lead">
                <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
              </p>
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
